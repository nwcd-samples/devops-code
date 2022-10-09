"use strict";
var form = layui.form,
    layer = layui.layer;
//监听提交
form.on('submit(formDemo)', function (data) {
    var obj = data.field;
    // 请求接口
    $.ajax({
        type: 'POST',
        data: obj,
        url: 'http://127.0.0.1:8082/user/login',
        success: function (data) {
            if(data==null){
                layer.msg("用户名或密码为空");
                console(data);
            }
            if(data=='userNameError'){
                layer.msg("用户名错误");
            }
            if(data=='passWordError'){
                layer.msg("密码错误");
            }
            if(data=="success"){
                location.href="index.html";
            }
        },
        error: function () {
            layer.msg('登录失败');
        }
    })
});