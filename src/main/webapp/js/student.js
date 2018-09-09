var parma =null;

function sels(){
		  $.getJSON("student/query.do",function(data){
			  $body = $(".table>tbody");
			  $body.empty();
			  console.log(data);
			  $.each(data,function(i,k){
				  $tr = $("<tr></tr>");
				  $("<td>"+(i+1)+"</td>").appendTo($tr);
				  $("<td>"+k.sname+"</td>").appendTo($tr);
				  $("<td>"+k.ssex+"</td>").appendTo($tr);
				  $("<td>"+k.sage+"</td>").appendTo($tr);
				  $("<td>"+k.sdept+"</td>").appendTo($tr);
				  $btn=$("<td class='text-center'><a>编辑</a></td>");
				  $btn.click(function(){
				  	$("#sno").val(k.sno);
				  	$("#name").val(k.sname);
				  	$("#sex").val(k.ssex);
				  	$("#age").val(k.sage);
				  	$("#dept").val(k.sdept);
				  }); 
				  $btn.appendTo($tr);
				  $("<td class='text-center'><a onclick='delet("+k.sno+")'>删除</a></td>").appendTo($tr);
				  $($tr).appendTo($body);
			  })
		  })
	}
	function getparma(){
		var sno=$("#sno").val();
		var name = $("#name").val();
		var sex =$("#sex").val();
		var age =$("#age").val();
		var dept =$("#dept").val();
       parma={Sno:sno,Sname:name,Ssex:sex,Sdept:dept}
	}
	
	
	

	function delet(sno){
        $.getJSON("student/remove.do",{Sno:sno},function(data){
          if(data){
          	sels();
          }else{
          	alert("删除失败");
          }
        })
	}
	$(function(){
		sels();
		$("#sub").click(function(){
			getparma();
			console.log(parma);
			$.post("student/save.do",parma,function(data){
	          if(data){
	          	sels();
	          }else{
	          	alert("更新失败");
	          }
	        })
		})
		$("#res").click(function(){
			$("#sno").val('');
			$("#name").val('');
			$("#sex").val('');
			$("#age").val('');
			$("#dept").val('');
		})
	  })