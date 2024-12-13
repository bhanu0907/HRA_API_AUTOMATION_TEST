package api.endpoints;

public class Roots {

  //public static  String	baseUrl="https://api.hraindia.org/api/v1";
  
  public static  String	baseUrl="https://petstore.swagger.io/v2";
	//https://petstore.swagger.io/v2
  //POST module
  
  //public static String postUrl=baseUrl+"/user/post";
  
  
  //https://petstore.swagger.io/v2/user/bhanu
  public static String postUrl=baseUrl+"/user";
  public static String getUrl=baseUrl+"/user/{username}";
  public static String updateUrl=baseUrl+"/user/{username}";
  public static String deleteUrl=baseUrl+"/user/";
  
}
