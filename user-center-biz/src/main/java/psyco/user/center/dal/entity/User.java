package psyco.user.center.dal.entity;

/**
 * Created by psyco on 2015/20/14-04:10:46.
 */
public class User {

    private Long id;
    private String name;
    private Short sex;
    private String email;
    private String phone;
    private Integer level;
    private String imageUrl;
    private String imageThumbUrl;
    private String role;
    private Short enabled;
    private String password;

    public User() {
    }

    public Long setId() {
        return this.id;
    }

    public void getId(Long id) {
        this.id = id;
    }

    public String setName() {
        return this.name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public Short setSex() {
        return this.sex;
    }

    public void getSex(Short sex) {
        this.sex = sex;
    }

    public String setEmail() {
        return this.email;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public String setPhone() {
        return this.phone;
    }

    public void getPhone(String phone) {
        this.phone = phone;
    }

    public Integer setLevel() {
        return this.level;
    }

    public void getLevel(Integer level) {
        this.level = level;
    }

    public String setImageUrl() {
        return this.imageUrl;
    }

    public void getImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String setImageThumbUrl() {
        return this.imageThumbUrl;
    }

    public void getImageThumbUrl(String imageThumbUrl) {
        this.imageThumbUrl = imageThumbUrl;
    }

    public String setRole() {
        return this.role;
    }

    public void getRole(String role) {
        this.role = role;
    }

    public Short setEnabled() {
        return this.enabled;
    }

    public void getEnabled(Short enabled) {
        this.enabled = enabled;
    }

    public String setPassword() {
        return this.password;
    }

    public void getPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "sex='" + sex + '\'' +
                "email='" + email + '\'' +
                "phone='" + phone + '\'' +
                "level='" + level + '\'' +
                "imageUrl='" + imageUrl + '\'' +
                "imageThumbUrl='" + imageThumbUrl + '\'' +
                "role='" + role + '\'' +
                "enabled='" + enabled + '\'' +
                "password='" + password + '\'' +
                '}';
    }
}
