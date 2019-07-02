
let users = []
$.ajax({
	url: "http://localhost:3000/items",
	success: function(data) {
		users = data;
		render(data);
	}
});
function render(data) {
	let content = ''
	for(let i=0; i<users.length;i++) {
		const user = data[i]
		content += `<tr>
		<td>
		<img src="${user.profile_image}"/>
		</td>
		<td>
		<a href="${user.link}" title="">${user.display_name}</a>
		</td>
		<td>
		${user.user_id}
		</td>
		<td>
		<a href="${user.website_url}" title="">${user.website_url}</a>
		</td>
		<td>
		${new Date(user.creation_date*1000).toLocaleString()}
		</td>
		</tr>`
	}
	$('#users').html(content)
}
function sort(order) {
	let asc = $('.asc');
	let desc = $('.desc');
	let name = order.attr('value').toLowerCase().split(' ').join('_');
	asc.css('opacity','0.3');
	desc.css('opacity','0.3');
	$('tbody>tr').remove();
	switch(order.attr('order')) {
		case '0':
		order.attr('order','1')
		order.find('.desc').css('opacity','1')
		if(name === 'display_name'){
			users.sort(function(a ,b){
				return a.display_name.localeCompare(b.display_name)
			})
		} else if(name === 'user_id') {
			users.sort(function(a ,b){
				return a.user_id - b.user_id
			})
		} else if(name === 'creation_date') {
			users.sort(function(a ,b){
				return a.creation_date - b.creation_date
			})
		}
		render(users)
		break;
		case '1':
		order.attr('order','2')
		order.find('.asc').css('opacity','1')
		order.find('.desc').css('opacity','0.3')
		if(name === 'display_name'){
			users.sort(function(a ,b){
				return b.display_name.localeCompare(a.display_name)
			})
		} else if(name === 'user_id') {
			users.sort(function(a ,b){
				return b.user_id - a.user_id
			})
		} else if(name === 'creation_date') {
			users.sort(function(a ,b){
				return b.creation_date - a.creation_date
			})
		}
		render(users)
		break;
		case '2':
		order.attr('order','1')
		order.find('.asc').css('opacity','0.3')
		order.find('.desc').css('opacity','1')
		if(name === 'display_name'){
			users.sort(function(a ,b){
				return a.display_name.localeCompare(b.display_name)
			})
		} else if(name === 'user_id') {
			users.sort(function(a ,b){
				return a.user_id - b.user_id
			})
		} else if(name === 'creation_date') {
			users.sort(function(a ,b){
				return a.creation_date - b.creation_date
			})
		}
		render(users)
		break;
	}
}