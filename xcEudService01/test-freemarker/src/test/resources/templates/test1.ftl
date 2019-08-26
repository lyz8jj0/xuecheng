<!DOCTYPE html>
<html>
<head>

    <meta charset="utf‐8">

    <title>Hello World!</title></head>
<body>
遍历模型数据中的list数据
<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>金额</td>
        <td>出生日期</td>
    </tr>
    <#if stus??>
        <#list stus as stu>
    <tr>
        <td>${stu_index+1}</td>
        <td <#if stu.name == '小明'>style="background: blue"</#if>>${stu.name}</td>
        <td>${stu.age}</td>
        <td>${stu.money}</td>
        <td>${stu.birthday?date}</td>
    </tr>
        </#list>
    </#if>
</table>
<br>
遍历模型数据中的map数据
<br>
姓名: ${(stuMap["stu1"].name)!'' }<br>
年龄: ${(stuMap["stu1"].age)!''}<br>
姓名: ${(stuMap.stu1.name)!''}<br>
年龄: ${(stuMap.stu1.age)!''}<br>
遍历map中的key <br>
<#list stuMap?keys as k>
姓名: ${stuMap[k].name }<br>
年龄: ${stuMap[k].age}<br>
</#list>
</body>
</html>