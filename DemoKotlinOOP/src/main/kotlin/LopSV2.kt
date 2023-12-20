class LopSV2 {
    var ma: Int = 0
    var ten: String = ""
    private var diemToan: Float = 0f

    // Khai báo prooerties (khai báo biến mới để xem sửa biến cũ  )
    var DiemToan: Float
        get() {
            return diemToan
        }
        set(value) {
            diemToan = value
        }


    private var diemVan: Float = 0f
    var DiemVan: Float
        get() {
            return diemVan
        }
        set(value) {
            diemVan = value
        }


    // khai báo cons
    constructor() {
        ma = 3105
        ten = "Thạch Hạo"
    }

    constructor(m: Int, t: String) {
        ma = m
        ten = t
    }

    // Tính ĐTB
    fun DTB(): Float {
        return (diemVan + diemToan) / 2
    }

    // Hàm toSting
    override fun toString(): String {
        return "mã SV là : $ma, tên SV là: $ten "
    }




}