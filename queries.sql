## Part 1: Test it with SQL
id int,
employer varchar,
name varchar,
skills varchar

## Part 2: Test it with SQL

select name from employer where location = 'St. Louis City';

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

Select name, description
from skill
inner join job_skills on skill.id = job_skills.skills_id
where jobs_id is not null
order by skill.name asc;

