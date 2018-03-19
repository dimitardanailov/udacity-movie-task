

> IMPORTANT: PLEASE REMOVE YOUR API KEY WHEN SHARING CODE PUBLICALLY
  
  
> If you ever upload your code to a public GitHub repo to share with other students or instructors, 
> it’s illegal to include your personal themoviedb.org API key. Please remove it and note 
> in a README where it came from, so someone else trying to run your code can create their 
> own key and will quickly know where to put it. Instructors and code reviewers 
> will expect this behavior for any public GitHub code.

My solution is a system variable: 

```
# Step 1
# Open your bash_profile
vim ~/.bash_profile
```

```
# Step 2
# Plaese add a new line with the follow syntax:
export MOVIE_KEY="MY_MOVIE_API_KEY"
```

````
# Step 3
# Update  the terminal configurations
source ~/.bash_profile
````

````
# Step 4
# Please test the configuration
echo $MOVIE_KEY

# The output should be the MOVIE KEY APP value

````