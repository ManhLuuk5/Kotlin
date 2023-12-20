fun main(args: Array<String>) {

    var sv1 = SinhVien("167752", "Cụ MạnhDC")
//var sv2= SinhVien("3105","Thạch Hạo")

// tạo đối tượng contructor
    var sp1 = SanPham()
    var sp2 = SanPham(1, "Đt", 1000)

    // test Sv2
    var sv2 = LopSV2()
    var sv3 = LopSV2(2, "Viêm")

    println("Thông tin sv2 là: ${sv2.ma}-${sv2.ten}")
    println("Thông tin sv3 là: ${sv3.ma}-${sv3.ten}")
    //get set thay đổi gtri sv2
    sv2.DiemToan = 9.5f
    println("Thông tin sv2là: ${sv2.DiemToan}")

    sv2.DiemVan = 8f
    var dtbSV2 = sv2.DTB()
    println("DTB sv2 là: $dtbSV2")

    println(sv2) // in ra toString
// in ra check
    var nx1 = SupostMethod(2005)
    nx1.Check()

    var test = This()
    test.diemToan = 7f
    test.diemVan = 8f
    test.checkLocal(3f,4f)

println("Điểm văn của test sau khi gọi hàm checkLocal: "+test.diemVan)
println("Điểm toán của test sau khi gọi hàm checkLocal: "+test.diemToan)


}
