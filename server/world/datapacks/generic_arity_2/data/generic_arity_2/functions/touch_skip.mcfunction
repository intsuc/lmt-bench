scoreboard players add #1 _ 1
scoreboard players operation #2 _ = #1 _

scoreboard players set #4 _ 0

scoreboard players operation #0 _ *= 65536 _
scoreboard players operation #2 _ *= 65536 _
scoreboard players set #3 _ 0
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/15
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/14
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/13
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/12
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/11
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/10
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/9
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/8
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/7
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/6
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/5
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/4
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/3
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/2
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/1
execute if score #4 _ matches 1.. run return 0

scoreboard players operation #0 _ += #0 _
scoreboard players operation #2 _ += #2 _
execute if score #0 _ matches 0.. if score #2 _ matches ..-1 run scoreboard players set #3 _ 1
execute if score #0 _ matches ..-1 if score #2 _ matches 0.. run scoreboard players set #3 _ 1
execute if score #3 _ matches 1.. run function generic_arity_2:touch_skip/0
scoreboard players operation #0 _ = #1 _
