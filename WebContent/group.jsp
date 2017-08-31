<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="table-responsive">
	<table class="table table-border">
		<thead>
			<tr>
				<th>No</th>
				<th>Team</th>
				<th>Coach</th>
				<th>National</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list">
				<tr>
					<td><s:property value="id"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="coach"/></td>
					<td><s:property value="national"/></td>
					<td>
						<a href="">Edit</a>
						<span>|</span>
						<a href="">Delete</a>
						<!-- <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">Delete</button> -->
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</div>
<div>
	<button type="button">Make Group</button>
</div>
<div class="row">
	<div class="col-md-6 col-xs-6">
		<div>A</div>
		<div>C</div>
	</div>
	<div class="col-md-6 col-xs-6">
		<div>B</div>
		<div>D</div>
	</div>
</div>
