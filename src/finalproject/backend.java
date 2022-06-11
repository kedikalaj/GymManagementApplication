

package finalproject;


import org.apache.commons.codec.digest.DigestUtils;
 class backend {
    
     
      private String admName = "admin";
     
      
      public static String HashedP(){
        String str = "pass";

        System.out.println(DigestUtils.md5Hex(str));
        
        return DigestUtils.md5Hex(str);
      }
       private String pswd = HashedP();//pass
      
    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }
      
     public static void main(String[] args) {
         HashedP();
     }
     
}
