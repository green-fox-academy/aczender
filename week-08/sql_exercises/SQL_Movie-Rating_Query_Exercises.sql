-- 1) Find the titles of all movies directed by Steven Spielberg.

SELECT title FROM movie
WHERE director = "Steven Spielberg";

-- 2) Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order.

SELECT DISTINCT year FROM movie
INNER JOIN rating 
    ON movie.mID = rating.mID
WHERE stars = 4 or stars = 5
ORDER BY year ASC;

-- 3) Find the titles of all movies that have no ratings.

SELECT DISTINCT title 
FROM movie, rating
WHERE movie.mid
NOT IN (SELECT movie.mid
FROM movie,rating
WHERE movie.mid = rating.mid);

-- 4) Some reviewers didn't provide a date with their rating. Find the names of all reviewers who have ratings with a NULL value for the date.

SELECT DISTINCT name FROM reviewer
INNER JOIN rating
    ON reviewer.rid = rating.rid
WHERE ratingDate IS NULL;

-- 5) Write a query to return the ratings data in a more readable format: reviewer name, movie title, stars, and ratingDate. Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars.

SELECT reviewer.name,
movie.title,
rating.stars,
rating.ratingDate
FROM reviewer, movie, rating
WHERE reviewer.rid = rating.rid AND rating.mid = movie.mid
ORDER BY reviewer.name, movie.title, rating.stars;


-- 5) Write a query to return the ratings data in a more readable format: reviewer name, movie title, stars, and ratingDate. Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars. SOLVED WITH INNER JOIN
SELECT name, title, stars, ratingDate
FROM reviewer
       INNER JOIN rating
         ON reviewer.rid = rating.rid
       INNER JOIN movie
         ON rating.mid = movie.mid
ORDER BY name, title, stars;


