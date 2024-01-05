class This {
    // instance var - truy xuất mọi nơi trog class
    var diemVan:Float= 0f
    var diemToan:Float= 0f
    fun checkLocal(diemVan:Float,diemToan:Float){
        println("Tổng biến cục bộ:  ${diemVan + diemToan}")
        println("Tổng của instance var là: " +(this.diemVan+this.diemToan))




this.diemToan=diemToan
this.diemVan=diemVan


    }





mnscji






}