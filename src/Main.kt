fun main(){

    var num = 0
    var movies = arrayOf("","","","","")
    while (num<5) {

        println("enter Your top 5 movies : ")
        var userinput = readLine()!!.toString()
        movies[num] = userinput
        num++
    }
    for(n in movies){
        println(n)
    }

}