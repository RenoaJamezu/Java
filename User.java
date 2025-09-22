public class User {
  private String _name; // known as access modifier // this can only be use inside this class file, anything outside gives an error
  private String _membership = "Basic"; // u can add default value

  // method overriding
  public String toString() {
    return get_name() + " " + get_membership();
  }

  // so that this works - User u2 = new User();
  public User() {
  }

  // form of encapsulation, Constructor
  public User(String name, String membership) {
    set_name(name);
    set_membership(membership);
  }

  // use this to set a value
  void set_name(String name) {
    _name = name;
  }

  // use this to get the value
  String get_name() {
    return _name;
  }

  void set_membership(String membership) {
    _membership = membership;
  }

  void set_membership(Membership membership) {
    _membership = membership.name();
  }

  public enum Membership {
    Basic, Premium, Vip;
  }

  String get_membership() {
    return _membership;
  }
}
