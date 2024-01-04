public class TelProcessor {
    private String phone;

    public TelProcessor(String phone){
        this.phone = phone;
    }

    public String phoneConventer(){
        try {
            if (phone.length() < 11) {
                throw new IllegalArgumentException("Phone number is too short");
            }

            int phoneNum1 = Integer.parseInt(phone.substring(phone.length() - 4));
            int phoneNum2 = Integer.parseInt(phone.substring(phone.length() - 7, phone.length() - 4));
            int phoneNum = Integer.parseInt(phone.substring(phone.length() - 10, phone.length() - 7));
            int code = Integer.parseInt(phone.substring(0, phone.length() - 10));

            return "+" + code + "(" + phoneNum + ")" + " " + phoneNum2 + "-" + phoneNum1;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid phone number format");
        }
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
