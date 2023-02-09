;

/*====================================================
      闭包：
        定义：是一个开放的、匿名的代码块，它可以接受参数、也可以有返回值。闭包可以引用其周围作用域中声明的变量。
        语法：{ [closureParameters -> ] statements }
        调用：
            第一步：将闭包赋值给一个变量
            第二步: 变量名()、变量名.call()

        闭包在实际开发中的使用：作为方法的参数使用
======================================================*/

/*def running ={ who ->
    println("$who running start...")
    println("$who running end...")
}

running("费玉清")
running("王菲")*/

def running(Closure closure){
    println("running start...")
    closure.call()
    println("running end...")
}
running ({println("running....")})


/*def caculate(num1,num2,Closure closure) {
    closure(num1,num2)
}

// 闭包作为方法的最后一个参数，那么闭包可以写在方法外边，去掉方法括号
caculate(10, 15,) { k, v -> println("$k + $v = ${k + v}") }*/


def caculate(Closure closure) {
    closure(num1,num2)
}
caculate { k, v -> println("$k + $v = ${k + v}") }