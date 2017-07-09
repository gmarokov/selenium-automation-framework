package utilities;

/*
 * Bean representing a browser. It contains name, version and platform fields.
 */
public class Browser {

    private String name;
    private String version;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String version){
        this.version = version;
    }
}
