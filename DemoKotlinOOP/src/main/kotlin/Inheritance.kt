open abstract class Inheritance {
    // instance var
    protected var ten:String=""
    protected var cccd:String=""
    protected var dc:String=""
var luongCoBan:Double=1000.0// $


    //hàm trừu tượng -> ép tất cả phải có nó
    public abstract fun TinhLuong():Double


    constructor(ten:String,cccd:String,dc:String){
        this.ten=ten
        this.cccd=cccd
        this.dc=dc

    }

    constructor(ten:String,cccd:String){
        this.ten=ten
        this.cccd=cccd


    }










}