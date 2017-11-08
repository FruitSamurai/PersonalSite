package com.github.fruitsamurai.util;

import com.alibaba.fastjson.annotation.JSONField;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public class IpUtils {

    private static CloseableHttpClient client = HttpClients.createDefault();

    private static String baseUrl = "http://ip.taobao.com/service/getIpInfo.php?ip=";

    private IpUtils(){}

    public static String getRemoteIp(HttpServletRequest request){
        //x-forward-for:代表客户端，也就是HTTP请求的真实IP地址，只有在通过负载均衡服务器或者HTTP代理时才会添加该项
        String ip = request.getHeader("x-forward-for");

        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;

    }

    /**
     * 获取ip地址的IP信息
     * @param ip
     * @return
     */
    public static String getIpInfo(String ip){
        HttpGet httpGet = new HttpGet(baseUrl+ip);
        try {
            HttpResponse response = client.execute(httpGet);
            URL url = new URL(baseUrl+ip);
            URLConnection connection = url.openConnection();
            connection.connect();
            String line = "";
            String tmp;
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
            while((tmp = in.readLine())!=null){
                line+=tmp;
            }
            return line;
//            if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
//                HttpEntity entity = response.getEntity();
//                BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(),"UTF-8"));
//                String tmp;
//                String content = "";
//                while((tmp = reader.readLine()) != null){
//                    content += tmp+"\r\n";
//                }
//                return content;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                client.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public static class Response{
        private int code;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public IpInfo getData() {
            return data;
        }

        public void setData(IpInfo data) {
            this.data = data;
        }

        private IpInfo data;
    }

    public static void main(String[] args) {
        String content = getIpInfo("36.5.159.181");
        System.out.println(content);
    }

    public static class IpInfo{
        private String country; //国家
        @JSONField(name = "country_id") private String countryId; //"CN"
        private String area; //地区名称（华南、华北...）
        @JSONField(name = "area_id") private String areaId; //地区编号
        private String region; //省名称

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountryId() {
            return countryId;
        }

        public void setCountryId(String countryId) {
            this.countryId = countryId;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAreaId() {
            return areaId;
        }

        public void setAreaId(String areaId) {
            this.areaId = areaId;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getCounty() {
            return county;
        }

        public void setCounty(String county) {
            this.county = county;
        }

        public String getCountyId() {
            return countyId;
        }

        public void setCountyId(String countyId) {
            this.countyId = countyId;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }

        public String getIspId() {
            return ispId;
        }

        public void setIspId(String ispId) {
            this.ispId = ispId;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        @JSONField(name = "region_id") private String regionId; //省编号
        private String city; //市名称
        @JSONField(name = "city_id") private String cityId; //市编号
        private String county; //县名称
        @JSONField(name = "county_id") private String countyId; //县编号
        private String isp; //ISP服务商名称（电信/联通/铁通/移动...）
        @JSONField(name = "isp_id") private String ispId; //ISP服务商编号
        private String ip; //查询的IP地址
    }

}
