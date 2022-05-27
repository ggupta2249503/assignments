

object p28_sortinglists {
  def main(args:Array[String]){
    
    //part a
    val lst=List(List('a', 'b', 'c'), List('d', 'e'), List('f', 'g', 'h'), List('d', 'e'), List('i', 'j', 'k', 'l'), List('m', 'n'), List('o'))
    val lst1=lst.sortWith((x,y)=>x.length<y.length)
    println(lst1)
    
    //part b
    val lst2=lst.map(x=>(x,x.length))
    println(lst2)
  }
}