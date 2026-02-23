class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        int year =Integer.parseInt(parts[0]);
        int month =Integer.parseInt(parts[1]);
        int day =Integer.parseInt(parts[2]);

       String Byear= Integer.toBinaryString(year);
       String Bmonth= Integer.toBinaryString(month);
       String Bday= Integer.toBinaryString(day);
       return Byear+"-"+Bmonth+"-"+Bday ;
    }
}