//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 val user1=User(1,"suman","suman@suman.com1");
 val user2=User(2,null,"suman@suman.com");
 val user3=User(3,"suman",null);
println("email length :${getemailUserLength(user1)} ")
printUserNameLength(user2)
println("email or placeholder${getEmailorPlaceholder(user3)}")



}
data class User(val id: Int,val name:String?,val email:String?)
 fun getemailUserLength(user: User):Int{
  var user1=user.email?.length
     return user1!!
 }
fun printUserNameLength(user: User){
 var user1=user.name
 println(user1)
}
fun getEmailorPlaceholder(user: User):String{
 var user1=user.email ?: "  no email provided"
return user1
}
