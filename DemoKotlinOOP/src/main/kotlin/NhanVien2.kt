class NhanVien2:Inheritance {

    constructor(ten:String,cccd:String):super(ten,cccd)

    override fun TinhLuong(): Double {
        //tăng lương só vs nv1 5%
        return luongCoBan*1.05
    }
}