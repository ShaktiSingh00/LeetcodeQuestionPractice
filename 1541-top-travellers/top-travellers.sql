# Write your MySQL query statement below
select name,ifnull(sum(distance),0) as travelled_distance from Users
left join Rides on Users.id = Rides.user_id
group by user_id
order by travelled_distance desc, name;