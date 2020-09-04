package communityuni.com.model;

public enum XepLoai {
    Gioi ("Giỏi"),
    Kha ("Khá"),
    TrungBinh ("Trung Bình"),
    Yeu ("Yếu");

    private String msg;
    XepLoai(String msg){
        this.msg = msg;
    }

    public String description(){
        return this.msg;
    }

}
