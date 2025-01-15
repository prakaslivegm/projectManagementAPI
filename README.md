# projectManagementAPI
Project Management API
Create Employee :
URL :http://localhost:8080/createNewEmployee
JSON Request Body : 
{
  "empId":"LI222",
	"empName":"xyzs",
	"capbCenter":"DEVAA",
	"doj":"12-12-2099",
	"designation":"Principal Engineer",
	"primarySkill":"Java",
	"secSkill":"java",
	"overallExp": 14,
	"projCount":0
}

Create Project Allocation : 
URL : http://localhost:8080/createNewAllocation
JSON Request Body : 
{
    "empSysId":"2",
    "accId":22,
    "projId":22
}
