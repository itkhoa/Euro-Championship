<%@ taglib prefix="s" uri="/struts-tags"%>


<form action="insert" method="post">
	<table class="table table-border">
		<thead>
			<tr>
				<th>Team</th>
				<th>Coach</th>
				<th>National</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><input type="text" class="form-control" name="team.name"></td>
				<td><input type="text" class="form-control" name="team.coach"></td>
				<td><input type="text" class="form-control" name="team.national"></td>
			</tr>
		</tbody>
	</table>
	<button type="submit" class="btn btn-primary">Save Team</button>
</form>
	
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
						<button type="button" class="btn btn-success">Edit</button>
						<s:url action="hello" var="delTeam">
						  <s:param name="teamId"><s:property value="id"/></s:param>
						</s:url>
						<button type="button" class="btn btn-danger" id="delete">Delete</button>
						<!-- <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">Delete</button> -->
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</div>
<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-body">
        <p>Do you want to delete this team?</p>
      </div>
      <div class="modal-footer">
      	<button type="button" class="btn btn-danger" id="delete">Yes</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
      </div>
    </div>
  </div>
</div>
<script type="text/javascript">
	$("delete").click(function(){
		$.get("delete", function(data, status){
			alert("Data: "+data + "\nStatus: "+Status);
		});
	});
</script>