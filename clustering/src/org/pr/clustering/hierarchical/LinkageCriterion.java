package org.pr.clustering.hierarchical;

public enum LinkageCriterion {
	/**
	 * Single Link 
	 */
	SINGLE,
	/**
	 * Complete Link 
	 */
	COMPLETE,
	/**
	 * Unweighted pair group method average
	 */
	UPGMA,
	/**
	 * weighted pair group method average
	 */
	WPGMA,
	/**
	 * unweighted pair group method centroid
	 */
	UPGMC,
	/**
	 * weighted pair group method centroid
	 */
	WPGMC,
	/**
	 * Ward's method
	 */
	Ward
}
