Game: Risk of Rain 1

Gameplay Elements

-Remove most items, stages, monsters, survivors, artifacts
-Start with commando as only survivor

World Gen
-instead of having 2 varients to each world, just have one
-teleporter+survivor can start in a fixed location

Enemies
-only lumerians, golems, and jellyfish to start with
-write a director to spawn things


Code Structure
-Animation object has get/set for x,y,w,h
	-terrain object contains all terrain with collision
		*static list of all collidables
		*move left and right (simulate player movement)
	-non-entity interactibles
		*generated on level spawn - looking for keyboard input in range
		*
asdf
