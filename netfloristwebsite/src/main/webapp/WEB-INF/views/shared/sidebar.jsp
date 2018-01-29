<p class="lead">Shop Name</p>
<div class="list-group">

	<c:foreEach items="${categories}" var="category">
		<a href="#" class="list-group-item">${category.name}</a>
	</c:foreEach>

</div>