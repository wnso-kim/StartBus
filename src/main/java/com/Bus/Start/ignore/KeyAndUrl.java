package com.Bus.Start.ignore;

public class KeyAndUrl {
    private String serviceKey;  // 공공데이터 개인 API인증키
    private String routeAllUrl; // 경유노선 전체 정류소 도착예정정보를 조회한다
    private String routeUrl;    // 한 정류소의 특정노선의 도착예정정보를 조회한다


    KeyAndUrl(){
        serviceKey = "q4WXxRcF5QXyItAWIfO5wgC8m363kiaFDL4Tv%2B627zq6oH9GxE%2BW1QtvpvMUGaadExMGxbIq%2FYncfSLtN9L%2BrQ%3D%3D";
        routeAllUrl = "http://ws.bus.go.kr/api/rest/arrive/getArrInfoByRouteAllList";
        routeUrl = "http://ws.bus.go.kr/api/rest/arrive/getArrInfoByRouteList";
    }

    public String getKey(){
        return serviceKey;
    }

    public String getRouteAllUrl(){
        return routeAllUrl;
    }

    public String getRouteUrl(){
        return routeUrl;
    }

}
