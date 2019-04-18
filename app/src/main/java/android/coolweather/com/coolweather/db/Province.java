package android.coolweather.com.coolweather.db;

public class Province extends DataSupport{
    private int id;
    private String provinceName;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId(){return id;}
    public void setId(int id){this.id=id;}


}
