Smart Parking Management System Eureka Dashboard Image - ![image](https://github.com/user-attachments/assets/3730e291-6dd5-450b-93b0-321684af9b95)

Yml files - https://github.com/erandie/SmartParkingManagementSystemYml.git


Smart Parking Management System Json File - [Uplo{
	"info": {
		"_postman_id": "f3c82c71-13b4-44ab-a64a-36fd3a924b44",
		"name": "Smart Parking Management System",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "40425934"
	},
	"item": [
		{
			"name": "User-Service",
			"item": [
				{
					"name": "Get All",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Save",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Update",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Delete",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Register",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Reset password",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Get User By Id",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Get Next User Id",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Get all user IDs by role",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				}
			]
		},
		{
			"name": "Vehicle-Service",
			"item": [
				{
					"name": "Get Vehicle by ID",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Update",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Delete",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Register",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\n  \"licensePlate\": \"ABC-1234\",\n  \"type\": \"Car\",\n  \"userId\": 2,\n  \"entryTime\": \"2025-06-25T14:00:00\",\n  \"exitTime\": \"2025-06-25T16:00:00\"\n}\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8083/api/vehicles/register",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8083",
							"path": [
								"api",
								"vehicles",
								"register"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Vehicles by User",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Get All Vehicles",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Update Vehicle Status",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				}
			]
		},
		{
			"name": "Payment-Service",
			"item": [
				{
					"name": "Save",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\n  \"vehicleId\": 2,\n  \"parkingDetailsId\": 4\n}\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8085/api/payments",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8085",
							"path": [
								"api",
								"payments"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Payment by ID",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Update",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Delete a Payment",
					"request": {
						"method": "GET",
						"header": []
					},
					"response": []
				},
				{
					"name": "Get All Payments",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8085/api/payments",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8085",
							"path": [
								"api",
								"payments"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Parking-Service",
			"item": [
				{
					"name": "ParkingSpaceController",
					"item": [
						{
							"name": "Get",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8084/api/parking-spaces/details/1/details",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8084",
									"path": [
										"api",
										"parking-spaces",
										"details",
										"1",
										"details"
									]
								}
							},
							"response": []
						},
						{
							"name": "Update",
							"request": {
								"method": "GET",
								"header": []
							},
							"response": []
						},
						{
							"name": "Delete",
							"request": {
								"method": "GET",
								"header": []
							},
							"response": []
						},
						{
							"name": "Registre",
							"request": {
								"method": "POST",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\n  \"location\": \"IJSE Kandyy\",\n  \"zone\": \"Zone-A\",\n  \"ownerId\": 1,\n  \"status\": \"AVAILABLE\"\n}\n",
									"options": {
										"raw": {
											"language": "json"
										}
									}
								},
								"url": {
									"raw": "http://localhost:8084/api/parking-spaces/register",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8084",
									"path": [
										"api",
										"parking-spaces",
										"register"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get space by ID",
							"request": {
								"method": "GET",
								"header": []
							},
							"response": []
						}
					]
				},
				{
					"name": "ParkingSpaceDetailsController",
					"item": [
						{
							"name": "save",
							"request": {
								"method": "POST",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\n  \"numberPlate\": \"ABC-1234\",\n  \"entryTime\": \"2025-08-25T07:00:00\",\n  \"exitTime\": \"2025-06-25T10:30:00\",\n  \"duration\": 220\n}\n",
									"options": {
										"raw": {
											"language": "json"
										}
									}
								},
								"url": {
									"raw": "http://localhost:8084/api/parking-spaces/details/1/details",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8084",
									"path": [
										"api",
										"parking-spaces",
										"details",
										"1",
										"details"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get Details by Parking Space ID",
							"request": {
								"method": "GET",
								"header": []
							},
							"response": []
						},
						{
							"name": "Get One Detail by Detail ID",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8084/api/parking-spaces",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8084",
									"path": [
										"api",
										"parking-spaces"
									]
								}
							},
							"response": []
						},
						{
							"name": "Delete Parking Detail",
							"request": {
								"method": "GET",
								"header": []
							},
							"response": []
						}
					]
				}
			]
		}
	]
}ading Smart Parking Management System.postman_collection.json…]()


/home/erandi/Smart Parking Management System.postman_collection.json - Json Collection


