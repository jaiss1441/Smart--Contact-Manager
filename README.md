Smart - Contact - Management- Application - Guideline




<!-- //////Tailwindcss Adding into project //////// -->
   Go on official website 
	click on get started
		click on Tailwind CLI
			npx tailwindcss init 
   			(after this command package.json file created in that file add "type":"module" and close it )
			install tailwind--npm install -D tailwindcss
			npx tailwindcss init 
   					(rerun above command it will create tailwind.config.js file and add the path of the CSS file into it example
					 ( content: ["./src/main/resources/**/*.{html,js}"]) then create an input.css file in
					 given location ./src/main/resources/static/css/input.css (add this sniped into that file @tailwind base;
					@tailwind components; @tailwind utilities; ) 
					after this, you have to run below given command to create the output.css file
			 npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch
					this will help you to create CSS in output.css after changing in html file, reflect changes in output.css you have to add output.css into html head section 								via link(<link rel="stylesheet" data-th-href="@{'/css/output.css'}" />) save and refresh you will see changes adding dark them into project you have 								to edit taileind.config.js file add (below plugins add darkMode:"selector") 

<!-- adding flowbite libraries into project -->

Go on official website
		click on get started 
		go on quickstart
		check for Include via CDN
		below this line link add into html file header section (<link href="https://cdn.jsdelivr.net/npm/flowbite@2.4.1/dist/flowbite.min.css" rel="stylesheet" />)
		below first link you get second link add that link into body section before closing tag of body(<script src="https://cdn.jsdelivr.net/npm/flowbite@				        			2.4.1/dist/flowbite.min.js"></script>) between this two link you can all component of this libraries


			
<!-- Thymeleaf Fragment Feature Useage -->

			It will help you use one componant in various html pages 
				its kind of function thing where you have you to create a separate html page where have create a tag in which put all infomation which you want on every html page and then add that tag into that perticula page via insert or replace option 

				Example :
				<!-- create saperate html page -->

					<div
					th:fragment="parent"
					><h1>Parent fragment</h1>
					<p>THis is fragment for testing</p>
					</div>



				 <!-- via insert  -->
				 <div th:insert="~{fragment :: parent}"></div>

				 <!-- via replace -->
				<div th:replace="fragments/alert :: alert (type='danger', message=${errorMessage})">...</div>

<!-- Advantage of thymeleaf concept -->
	it will help you reduce multiple code/link inserting in our page via fragmentation in which we have to create diffrent file for that in that you have create multiple fragment then insert/replace that link/code into requred places  same like abouv example create diffrent tag put your requred info/link/code and then use it 

<!-- Errors Face and Solution -->
remote origin already exists. ---(Solution- git remote set-url origin "Put project link here ")
