class SupostMethod {

    private var namSinh: Int = 0

    // khai báo pro
    var NamSinh: Int
        get() {
            return namSinh
        }
        set(value) {
            namSinh = value
        }

    // khai báo contruc
    constructor(y: Int) {
        namSinh = y
    }

    // Test tuổi suposst method- chỉ sd trog nội bộ
    private fun CheckTuoi(): Boolean {
        var tuoi = 2023 - namSinh
        return tuoi >= 18
    }

    // service method // mọi nơi
    fun Check() {
        if (CheckTuoi()) {
            println("Yes sir bạn đã đủ trình")
        } else
            println("B tuổi gì Next to menu")
    }

    fun DTB(diemToan:Float, diemVan:Float):Float
    {
        return (diemToan+diemVan) /2
    }

}