scoreboard players set #0 _ 0
scoreboard players operation #1 _ = #0 _

scoreboard players operation #1 _ *= 65536 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _ append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []

scoreboard players operation #1 _ += #1 _
execute if score #1 _ matches 0.. run data remove storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][2]
execute if score #1 _ matches ..-1 run data modify storage generic_arity_2: _[-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2][-2] append value []
