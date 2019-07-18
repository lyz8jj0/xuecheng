<template>
  <!--编写页面静态部分, 即view部分-->
  <div></div>
</template>
<script>
  // 编写页面静态部分,即model及vm部分
  import * as cmsApi from '../api/cms'
  //填写js代码，实现VM的功能，创建vue实例
  export default {
    data() {
      return {
        siteList: [],//站点列表
        list: [],
        total: 50,
        params: {
          page: 1,
          size: 10,
          siteId: '',
          pageAliase: ''
        }
      }
    },
    methods: {
      query: function () {
        // alert('查询')
        cmsApi.page_list(this.params.page, this.params.size,this.params).then((res) => {
          //将res结果数据赋值给数据模型对象
          this.list = res.queryResult.list;
          this.total = res.queryResult.total;
        })
      },
      changePage: function (page) {//形参就是当前页码
        //调用query方法
        this.params.page = page;
        this.query();
      }
    },
    mounted() {
      //当DOM元素渲染完成后调用query
      this.query();
      //初始化站点列表
      this.siteList = [
        {
          siteId: '5a751fab6abb5044e0d19ea1',
          siteName: '门户主站'
        },
        {
          siteId: '102',
          siteName: '测试站'
        }
      ]
    }
  }
</script>
<style>
  /*编写页面样式,不是必须*/
</style>
