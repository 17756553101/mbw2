//1.引入express
const { response } = require("express");
//2.创建应用对象
const express = require("express");
//3.创建路由规则
//request 是对请求报文的封装
//response是对相应报文的封装
const app = express();
app.all("/json-server", (require, response) => {
    //设置响应头 设置允许跨域
    response.setHeader("Access-Control-Allow-Origin", "*");
    //响应一个对象
    const data = {
        name: 'atguigu'
    };
    //转换对象
    let str = JSON.stringify(data);
    //设置响应体
    response.send(str);
});

app.all("/server", (require, response) => {
    //设置响应头 设置允许跨域
    response.setHeader("Access-Control-Allow-Origin", "*");
    //响应头
    response.setHeader('Access-Control-Allow-Headers', '*');
    //设置响应体
    response.send(" hello ajax POST");
});
//针对ie
app.all("/ie", (require, response) => {
    //设置响应头 设置允许跨域
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader('Access-Control-Allow-Headers', '*');
    //响应一个对象
    const data = {
        name: 'hello ie'
    };
    //转换对象
    let str = JSON.stringify(data);
    //设置响应体
    setTimeout(function () {
        response.send(str);

    }, 100)
    // 
});

//监听端口启动
app.listen(8000, () => {
    console.log("服务已经启动，8000端口监听中...");
})