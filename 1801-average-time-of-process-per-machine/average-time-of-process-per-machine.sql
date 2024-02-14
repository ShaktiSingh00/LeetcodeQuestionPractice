select w1.machine_id, round(avg(w2.timestamp - w1.timestamp),3) as processing_time
from Activity w1 
join Activity w2 on w1.machine_id = w2.machine_id and w1.process_id = w2.process_id and w1.activity_type = 'start' and w2.activity_type= 'end'
group by w1.machine_id ;