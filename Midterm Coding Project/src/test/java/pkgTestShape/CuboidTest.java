package pkgTestShape;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test; 

import pkgShape.Cuboid;
import pkgShape.Rectangle;


public class CuboidTest {
	
	@Test
	public void CuboidTest {
		Cuboid cube = new Cuboid(3,4,5);
		assertEquals(cube.getLength(),3);
		assertEquals(cube.getWidth(),4);
		assertEquals(cube.getDepth(),5);
	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void CuboidTest2() {
		Cuboid cube = new Cuboid(1,2,-3);
	}

	@Test (expected = UnsupportedOperationException.class)
	public void PerimeterTest() {
		Cuboid cube = new Cuboid(3,4,5);
		cube.perimeter();
	}
	
	@Test 
	public void getDepthTest() {
		Cuboid cube = new cuboid(3,4,5);
		assertEquals(cube.getDepth(),5);
		
	}
	
	@Test 
	public void setDepthTest() {
		Cuboid cube = new Cuboid(3,4,5);
		cube.setDepth(7);
		assertEquals(cube.getDepth(),7);
		
	}
	
	@Test
	public void areaTest() {
		Cuboid cube = new Cuboid(2,7,9);
		assertTrue(cub.area() == 190);
	}	
}
	@Test
	public void sortByAreaTest() {
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>(3);
		Cuboid cub = new Cuboid(1,1,1);
		Cuboid cub2 = new Cuboid(2,2,2);
		Cuboid cub3 = new Cuboid(3,3,3);
		
		cubes.add(cub3);
		cubes.add(cub);
		cubes.add(cub2);
		
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>(3);
		expected.add(cub);
		expected.add(cub2);
		expected.add(cub3);
		
		Collections.checkedSortedMap(cubes,  new Cuboid.SortByArea());
		assertTrue(cubes.equals(expected));
	}

		@Test
		public void sortByVolumeTest() {
			ArrayList<Cuboid> cubes = new ArrayList<Cuboid>(3);
			Cuboid cub = new Cuboid(1,1,1);
			Cuboid cub2 = new Cuboid(2,2,2);
			Cuboid cub3 = new Cuboid(3,3,3);
			
			cubes.add(cub3);
			cubes.add(cub);
			cubes.add(cub2);
			
			ArrayList<Cuboid> expected = new ArrayList<Cuboid>(3);
			expected.add(cub);
			expected.add(cub2);
			expected.add(cub3);
			
			Collections.sort(cubes, new Cuboid.SortByVolume());
			assertTrue(cubes.equals(expected));
			
		}




