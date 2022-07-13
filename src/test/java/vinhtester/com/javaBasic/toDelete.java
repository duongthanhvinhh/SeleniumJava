package vinhtester.com.javaBasic;

public class toDelete {
    private String fullName;
    public toDelete(){

    }
//setter and getter
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public static void main(String[] args) {
        toDelete obj = new toDelete();
        obj.setFullName("vinh");
        System.out.println(obj.getFullName());

    }
}
