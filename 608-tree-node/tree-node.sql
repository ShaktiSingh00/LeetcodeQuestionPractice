# Write your MySQL query statement below
select id,
      case
          
          when p_id is null then 'Root'
          WHEN EXISTS (SELECT 1 FROM Tree WHERE p_id = t.id) THEN 'Inner'
          else 'Leaf'
      end as type

      from Tree t