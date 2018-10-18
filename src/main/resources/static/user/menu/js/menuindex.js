/**
 * 新增页面的html
 * @returns
 */
function newMenu(){
	 $('#editDlg').dialog('open').dialog('setTitle','创建菜单');
	    $('#fm').form('clear');
	    url = '/menu/add';
}