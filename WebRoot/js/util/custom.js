    $(function() {
        $("#tabs").tabs();
        $(".stSlt").selectmenu();
        $(".alltime").datetimepicker({dateFormat: "yy-mm-dd"});
        //海洋气象预警
        $("#yjtime").datetimepicker({dateFormat: "yy-mm-dd"});
        $("#yj-type").selectmenu({
            change: function(event,data) {
                var yjval = $(this).val();
                var yjbox = $("#yj-"+yjval);
                $(".yjbox").hide();
                yjbox.show();
            }
        });
        $( "#slider-yjsx" ).slider({
            range: "min",
            value: 0,
            min: 0,
            max: 48,
            slide: function( event, ui ) {
                $( "#yjsx" ).val(ui.value +"小时");
            }
        });
        $( "#yjsx" ).val($( "#slider-yjsx" ).slider( "value" ) +"小时");

        $( "#slider-qxbj" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 250,
            slide: function( event, ui ) {
                $( "#qxbj" ).val(ui.value +"海里");
            }
        });
        $( "#qxbj" ).val($( "#slider-qxbj" ).slider( "value" ) +"海里");

        $( "#slider-ydsd" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 63,
            slide: function( event, ui ) {
                $( "#ydsd" ).val(ui.value +"公里/小时");
            }
        });
        $( "#ydsd" ).val($( "#slider-ydsd" ).slider( "value" ) +"公里/小时");

        $( "#slider-ydfx" ).slider({
            range: "min",
            value: 0,
            min: 0,
            max: 359,
            slide: function( event, ui ) {
                $( "#ydfx" ).val(ui.value +"°");
            }
        });
        $( "#ydfx" ).val($( "#slider-ydfx" ).slider( "value" ) +"°");

        $( "#slider-zxfl" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 20,
            slide: function( event, ui ) {
                $( "#zxfl" ).val(ui.value +"级");
            }
        });
        $( "#zxfl" ).val($( "#slider-zxfl" ).slider( "value" ) +"级");

        $( "#slider-fbj" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 250,
            slide: function( event, ui ) {
                $( "#fbj" ).val(ui.value +"海里");
            }
        });
        $( "#fbj" ).val($( "#slider-fbj" ).slider( "value" ) +"海里");   
        
        $( "#slider-zdfl" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 20,
            slide: function( event, ui ) {
                $( "#zdfl" ).val(ui.value +"级");
            }
        });
        $( "#zdfl" ).val($( "#slider-zdfl" ).slider( "value" ) +"级");

        $( "#slider-zgfl" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 20,
            slide: function( event, ui ) {
                $( "#zgfl" ).val(ui.value +"级");
            }
        });
        $( "#zgfl" ).val($( "#slider-zgfl" ).slider( "value" ) +"级");

        $( "#slider-lbj" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 250,
            slide: function( event, ui ) {
                $( "#lbj" ).val(ui.value +"公里");
            }
        });
        $( "#lbj" ).val($( "#slider-lbj" ).slider( "value" ) +"公里");

        $( "#slider-bgao" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 31,
            slide: function( event, ui ) {
                $( "#bgao" ).val(ui.value +"米");
            }
        });
        $( "#bgao" ).val($( "#slider-bgao" ).slider( "value" ) +"米");

        $( "#slider-bzq" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 3600,
            slide: function( event, ui ) {
                $( "#bzq" ).val(ui.value +"秒");
            }
        });
        $( "#bzq" ).val($( "#slider-bzq" ).slider( "value" ) +"秒");

        $( "#slider-wbj" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 500,
            slide: function( event, ui ) {
                $( "#wbj" ).val(ui.value +"公里");
            }
        });
        $( "#wbj" ).val($( "#slider-wbj" ).slider( "value" ) +"公里");

        $( "#slider-njd" ).slider({
            range: "min",
            value: 0.0,
            min: 0.0,
            max: 25.0,
            step: 0.1,
            slide: function( event, ui ) {
                $( "#njd" ).val(ui.value +"海里");
            }
        });
        $( "#njd" ).val($( "#slider-njd" ).slider( "value" ) +"海里");

        $( "#slider-fbcbj" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 500,
            slide: function( event, ui ) {
                $( "#fbcbj" ).val(ui.value +"海里");
            }
        });
        $( "#fbcbj" ).val($( "#slider-fbcbj" ).slider( "value" ) +"海里");

        $( "#slider-zs" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 500,
            slide: function( event, ui ) {
                $( "#zs" ).val(ui.value +"厘米");
            }
        });
        $( "#zs" ).val($( "#slider-zs" ).slider( "value" ) +"厘米");

        $( "#slider-cw" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 1000,
            slide: function( event, ui ) {
                $( "#cw" ).val(ui.value +"厘米");
            }
        });
        $( "#cw" ).val($( "#slider-cw" ).slider( "value" ) +"厘米");

        $( "#slider-fbcbzq" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 3600,
            slide: function( event, ui ) {
                $( "#fbcbzq" ).val(ui.value +"秒");
            }
        });
        $( "#fbcbzq" ).val($( "#slider-fbcbzq" ).slider( "value" ) +"秒");        

        $( "#slider-hbbj" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 500,
            slide: function( event, ui ) {
                $( "#hbbj" ).val(ui.value +"公里");
            }
        });
        $( "#hbbj" ).val($( "#slider-hbbj" ).slider( "value" ) +"公里");

        $( "#slider-hbhd" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 30,
            slide: function( event, ui ) {
                $( "#hbhd" ).val(ui.value +"厘米");
            }
        });
        $( "#hbhd" ).val($( "#slider-hbhd" ).slider( "value" ) +"厘米");

        $( "#slider-hcbj" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 500,
            slide: function( event, ui ) {
                $( "#hcbj" ).val(ui.value +"公里");
            }
        });
        $( "#hcbj" ).val($( "#slider-hcbj" ).slider( "value" ) +"公里");

        //水文气象预报
        $("#ybtime").datetimepicker({dateFormat: "yy-mm-dd"});
        $(".gctime").each(function(){
            $(this).datetimepicker({dateFormat: "yy-mm-dd"});
        });
        $(".dctime").each(function(){
            $(this).datetimepicker({dateFormat: "yy-mm-dd"});
        }); 

        //助航标注动态
        $("#zhb-state").selectmenu({
            change: function(event,data) {
                var zhbval = $(this).val();
                if(zhbval<6) {
                	zhbval = 1;
                }
                var zhbbox = $("#zhb-"+zhbval);
                $(".zhbbox").hide();
                zhbbox.show();
            }
        });
        $( "#slider-zhb-time" ).slider({
            range: "min",
            value: 0,
            min: 0,
            max: 48,
            slide: function( event, ui ) {
                $( "#zhb-time" ).val(ui.value +"小时");
            }
        });
        $( "#zhb-time" ).val($( "#slider-zhb-time" ).slider( "value" ) +"小时");

        $( "#slider-zhb-fspl" ).slider({
            range: "min",
            value: 0,
            min: 283.5,
            max: 325.0,
            step: 0.1,
            slide: function( event, ui ) {
                $( "#zhb-fspl" ).val(ui.value +"KHz");
            }
        });
        $( "#zhb-fspl" ).val($( "#slider-zhb-fspl" ).slider( "value" ) +"KHz");        
        
        //碍航物
        $( "#slider-ahw-bj" ).slider({
            range: "min",
            value: 0,
            min: 0,
            max: 12.7,
            step: 0.1,
            slide: function( event, ui ) {
                $( "#ahw-bj" ).val(ui.value +"海里");
            }
        });
        $( "#ahw-bj" ).val($( "#slider-ahw-bj" ).slider( "value" ) +"海里");        

        $("#ahw-time1").datetimepicker({dateFormat: "yy-mm-dd"});
        $("#ahw-time2").datetimepicker({dateFormat: "yy-mm-dd"});

        //施工作业
        $( "#slider-sgzy-bj" ).slider({
            range: "min",
            value: 0,
            min: 0,
            max: 12.7,
            step: 0.1,
            slide: function( event, ui ) {
                $( "#sgzy-bj" ).val(ui.value +"海里");
            }
        });
        $( "#sgzy-bj" ).val($( "#slider-sgzy-bj" ).slider( "value" ) +"海里"); 

        $("#sgzy-time1").datetimepicker({dateFormat: "yy-mm-dd"});
        $("#sgzy-time2").datetimepicker({dateFormat: "yy-mm-dd"});        

        //笨重拖带
        $( "#slider-bztd-zc" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 500,
            slide: function( event, ui ) {
                $( "#bztd-zc" ).val(ui.value +"米");
            }
        });
        $( "#bztd-zc" ).val($( "#slider-bztd-zc" ).slider( "value" ) +"米"); 

        $("#bztd-time1").datetimepicker({dateFormat: "yy-mm-dd"});
        $("#bztd-time2").datetimepicker({dateFormat: "yy-mm-dd"});

        $( "#slider-bztd-hs" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 63,
            slide: function( event, ui ) {
                $( "#bztd-hs" ).val(ui.value +"节");
            }
        });
        $( "#bztd-hs" ).val($( "#slider-bztd-hs" ).slider( "value" ) +"节");

        //演习、打靶、海上军事活动
        $("#hd-time1").datetimepicker({dateFormat: "yy-mm-dd"});
        $("#hd-time2").datetimepicker({dateFormat: "yy-mm-dd"});                 

        //船舶遇险
        $( "#slider-cbyx-fbsx" ).slider({
            range: "min",
            value: 0,
            min: 0,
            max: 48,
            slide: function( event, ui ) {
                $( "#cbyx-fbsx" ).val(ui.value +"小时");
            }
        });
        $( "#cbyx-fbsx" ).val($( "#slider-cbyx-fbsx" ).slider( "value" ) +"小时");    

        //划定区域（圆形、矩形）
        $("#hdqy-1-tx").selectmenu({
            change: function(event,data) {
                var hdqytxval = $(this).val();
                var hdqytxbox = $("#hdqytx-"+hdqytxval);
                $(".hdqytxbox").hide();
                hdqytxbox.show();
            }
        });
        $( "#slider-hdqytx-bj" ).slider({
            range: "min",
            value: 0,
            min: 0,
            max: 12.7,
            step: 0.1,
            slide: function( event, ui ) {
                $( "#hdqytx-bj" ).val(ui.value +"海里");
            }
        });
        $( "#hdqytx-bj" ).val($( "#slider-hdqytx-bj" ).slider( "value" ) +"海里");

        //港口及锚地状况
        $( "#slider-gkjmd-bwzs" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 4000,
            slide: function( event, ui ) {
                $( "#gkjmd-bwzs" ).val(ui.value);
            }
        });
        $( "#gkjmd-bwzs" ).val($( "#slider-gkjmd-bwzs" ).slider( "value" ));
        $( "#slider-gkjmd-tbcbsl" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 4000,
            slide: function( event, ui ) {
                $( "#gkjmd-tbcbsl" ).val(ui.value);
            }
        });
        $( "#gkjmd-tbcbsl" ).val($( "#slider-gkjmd-tbcbsl" ).slider( "value" ));
        $( "#slider-gkjmd-dhjgcbsl" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 4000,
            slide: function( event, ui ) {
                $( "#gkjmd-dhjgcbsl" ).val(ui.value);
            }
        });
        $( "#gkjmd-dhjgcbsl" ).val($( "#slider-gkjmd-dhjgcbsl" ).slider( "value" ));
        $( "#slider-gkjmd-gkmdsl" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 127,
            slide: function( event, ui ) {
                $( "#gkjmd-gkmdsl" ).val(ui.value);
            }
        });
        $( "#gkjmd-gkmdsl" ).val($( "#slider-gkjmd-gkmdsl" ).slider( "value" ));
        $( "#slider-gkjmd-dhtbcbsl" ).slider({
            range: "min",
            value: 1,
            min: 1,
            max: 4000,
            slide: function( event, ui ) {
                $( "#gkjmd-dhtbcbsl" ).val(ui.value);
            }
        });
        $( "#gkjmd-dhtbcbsl" ).val($( "#slider-gkjmd-dhtbcbsl" ).slider( "value" ));
    });
    //报文分类
    $('input[name="ipt_bwNo"]').click(function(){
        var bwNo = $('input[name="ipt_bwNo"]:checked').val();
        if (bwNo == 0){
            $("#mmsi-m").show();
        }else{
            $("#mmsi-m").hide();
            $("#mmsi-m input").val("");
        }
    });
    $('input[name="ipt_bwNo2"]').click(function(){
        var bwNo2 = $('input[name="ipt_bwNo2"]:checked').val();
        if (bwNo2 == 0){
            $("#mmsi-m2").show();
        }else{
            $("#mmsi-m2").hide();
            $("#mmsi-m2 input").val("");
        }
    });
    $('input[name="ipt_bwNo3"]').click(function(){
        var bwNo3 = $('input[name="ipt_bwNo3"]:checked').val();
        if (bwNo3 == 0){
            $("#mmsi-m3").show();
        }else{
            $("#mmsi-m3").hide();
            $("#mmsi-m3 input").val("");
        }
    });
    $('input[name="hwfVo.messageNo"]').click(function(){
        var bwNo4 = $('input[name="hwfVo.messageNo"]:checked').val();
        if (bwNo4 == 0){
            $("#mmsi-m4").show();
        }else{
            $("#mmsi-m4").hide();
            $("#mmsi-m4 input").val("");
        }
    });
    $('input[name="ipt_bwNo5"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo5"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m5").show();
        }else{
            $("#mmsi-m5").hide();
            $("#mmsi-m5 input").val("");
        }
    });
    $('input[name="ipt_bwNo6"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo6"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m6").show();
        }else{
            $("#mmsi-m6").hide();
            $("#mmsi-m6 input").val("");
        }
    });
    $('input[name="ipt_bwNo7"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo7"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m7").show();
        }else{
            $("#mmsi-m7").hide();
            $("#mmsi-m7 input").val("");
        }
    });
    $('input[name="ipt_bwNo8"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo8"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m8").show();
        }else{
            $("#mmsi-m8").hide();
            $("#mmsi-m8 input").val("");
        }
    });
    $('input[name="ipt_bwNo9"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo9"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m9").show();
        }else{
            $("#mmsi-m9").hide();
            $("#mmsi-m9 input").val("");
        }
    });
    $('input[name="ipt_bwNo10"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo10"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m10").show();
        }else{
            $("#mmsi-m10").hide();
            $("#mmsi-m10 input").val("");
        }
    });
    $('input[name="ipt_bwNo11"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo6"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m11").show();
        }else{
            $("#mmsi-m11").hide();
            $("#mmsi-m11 input").val("");
        }
    });
    $('input[name="ipt_bwNo12"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo12"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m12").show();
        }else{
            $("#mmsi-m12").hide();
            $("#mmsi-m12 input").val("");
        }
    });
    $('input[name="ipt_bwNo15"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo15"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m15").show();
        }else{
            $("#mmsi-m15").hide();
            $("#mmsi-m15 input").val("");
        }
    });
    $('input[name="ipt_bwNo19"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo19"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m19").show();
        }else{
            $("#mmsi-m19").hide();
            $("#mmsi-m19 input").val("");
        }
    });
    $('input[name="ipt_bwNo20"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo20"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m20").show();
        }else{
            $("#mmsi-m20").hide();
            $("#mmsi-m20 input").val("");
        }
    });                                    
    $('input[name="ipt_bwNo22"]').click(function(){
        var bwNo5 = $('input[name="ipt_bwNo22"]:checked').val();
        if (bwNo5 == 0){
            $("#mmsi-m22").show();
        }else{
            $("#mmsi-m22").hide();
            $("#mmsi-m22 input").val("");
        }
    });

    //添加经纬度
    $("#add").click(function(){
        var templi = $("#diyBox ul li:first").clone(true); 
        if ($("#diyBox ul li").length >13) { 
            alert("多了!"); 
        } else { 
            $("#diyBox ul li:last").after(templi); 
        }
    });
    $("#add2").click(function(){
        var templi = $("#diyBox2 ul li:first").clone(true); 
        if ($("#diyBox2 ul li").length >13) { 
            alert("多了!"); 
        } else { 
            $("#diyBox2 ul li:last").after(templi); 
        }
    });
    $("#add-sw").click(function(){
        var tempdd = $("#tabs-4 dl dd:first").clone(true); 
        var j = $("input[name='gctime']").length;
        if ($("#tabs-4 dl dd").length >13) { 
            alert("多了!"); 
        } else {
            $("#tabs-4 dl dd:last").after(tempdd);
            $("#tabs-4 dl dd:last input.dctime").attr("id", ++$.datepicker.uuid).removeClass("hasDatepicker").datetimepicker({dateFormat: "yy-mm-dd"});
            $("#tabs-4 dl dd:last input.gctime").attr("id", ++$.datepicker.uuid).removeClass("hasDatepicker").datetimepicker({dateFormat: "yy-mm-dd"});
        }        
    });
    $("#add-hd").click(function(){
        var templi = $("#hdbox ul li:first").clone(true); 
        if ($("#hdbox ul li").length >13) { 
            alert("多了!"); 
        } else { 
            $("#hdbox ul li:last").after(templi); 
        }
    });
    $("#add-hdqy").click(function(){
        var templi = $("#hdqybox ul li:first").clone(true); 
        if ($("#hdqybox ul li").length >13) { 
            alert("多了!"); 
        } else { 
            $("#hdqybox ul li:last").after(templi); 
        }
    });
    $("#add-hxtj").click(function(){
        var templi = $("#hxtjbox ul li:first").clone(true); 
        if ($("#hxtjbox ul li").length >13) { 
            alert("多了!"); 
        } else { 
            $("#hxtjbox ul li:last").after(templi); 
        }
    });        
    //删除经纬度
    $("#del").click(function() {      
        if ($("#diyBox ul li").length < 2) { 
            alert("至少保留一行!"); 
        } else { 
            $(this).parent().remove();
        }
    });
    $("#del2").click(function() {      
        if ($("#diyBox2 ul li").length < 2) { 
            alert("至少保留一行!"); 
        } else { 
            $(this).parent().remove();
        }
    });
    $("#del-sw").click(function() {      
        if ($("#tabs-4 dl dd").length < 2) { 
            alert("至少保留一行!"); 
        } else { 
            $(this).parent().parent().remove();
        }
    });
    $("#del-hd").click(function() {      
        if ($("#hdbox ul li").length < 2) { 
            alert("至少保留一行!"); 
        } else { 
            $(this).parent().remove();
        }
    });
    $("#del-hdqy").click(function() {      
        if ($("#hdqybox ul li").length < 2) { 
            alert("至少保留一行!"); 
        } else { 
            $(this).parent().remove();
        }
    });
    $("#del-hxtj").click(function() {      
        if ($("#hxtjbox ul li").length < 2) { 
            alert("至少保留一行!"); 
        } else { 
            $(this).parent().remove();
        }
    });