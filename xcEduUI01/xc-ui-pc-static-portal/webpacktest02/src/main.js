var {add} = require("./model01")
var Vue = require("./vue.min")
//编写MVVM中的model部分和VM(ViewModel)部分
var VM = new Vue({
    el: '#app',//vm接管了app区域的管理
    data: { //model数据
        name: '黑马程序员',
        num1: 0,
        num2: 0,
        result: 0,
        size: 22
    },
    methods: {
        change: function () {
            this.result = add(Number.parseInt(this.num1), Number.parseInt(this.num2))
        }
    }
});