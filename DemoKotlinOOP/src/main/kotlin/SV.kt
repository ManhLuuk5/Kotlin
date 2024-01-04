package main.kotlin

class SV {
    constructor()
    {
        println("Đây là secondary constructor 0 đối số")
    }
    constructor(ma:Int,ten:String)
    {
        println("Đây là secondary constructor 2 đối số")
        println("Mã=$ma ; Tên =$ten")
    }
}