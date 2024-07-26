Smart - Contact - Management- Application - Guideline




<!-- //////Tailwindcss Adding into project //////// -->
   Go on official website 
	click on get started
		click on Tailwind CLI
			npx tailwindcss init (after this commond package.json file created in that file add "type":"module" and close it )
			install tailwind--npm install -D tailwindcss
			npx tailwindcss init (run again this command tailwind.config.js file is created after this command open this file and add path of css file exapmle
				 ( content: ["./src/main/resources/**/*.{html,js}"]) then create input.css file in
					 given location ./src/main/resources/static/css/input.css (add this sniped into that file @tailwind base;
					@tailwind components; @tailwind utilities; ) 
					after this you have run given command to create output.css file
					 --(npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch) 
					this will help you to create css in output.css after changing in html file, reflect changes in output.css you have to add css into html head section 					via link(<link rel="stylesheet" data-th-href="@{'/css/output.css'}" />) save and refresh you will see changes adding dark them into project you have 					to edit taileind.config.js file add (below plugins add darkMode:"selector") 

<!-- adding flowbite libraries into project -->

Go on official website
		click on get started 
		go on quickstart
		check for Include via CDN
		below this line link add into html file header section (<link href="https://cdn.jsdelivr.net/npm/flowbite@2.4.1/dist/flowbite.min.css" rel="stylesheet" />)
		below first link you get second link add that link into body section before closing tag of body(<script src="https://cdn.jsdelivr.net/npm/flowbite@				        2.4.1/dist/flowbite.min.js"></script>) between this two link you can all component of this libraries


			
			

<!-- Errors Face and Solution -->
remote origin already exists. ---(Solution- git remote set-url origin "Put project link here ")
