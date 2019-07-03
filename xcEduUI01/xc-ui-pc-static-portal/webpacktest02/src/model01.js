var add = function (x, y) {
    debugger
    return x + y;
};

var add2 = function (x, y) {
    return x + y;
};

module.exports.add = add;
// module.exports = {add, add2}; 如果是多个方法这样导出