package org.openstreetmap.gui.jmapviewer.interfaces;

//License: GPL. Copyright 2008 by Jan Peter Stotz

/**
 * Interface for implementing a tile loader. Tiles are usually loaded via HTTP
 * or from a file.
 * 
 * @author Jan Peter Stotz
 */
public interface TileLoader {
	/**
	 * Set the listener which will be notified of jobs being finished.
	 * @param listener the listener to set.
	 */
	void setTileLoaderListener(TileLoaderListener listener);
	
    /**
     * A typical {@link #createTileLoaderJob(int, int, int)} implementation
     * should create and return a new {@link Job} instance that performs the
     * load action.
     * 
     * @param tileLayerSource
     * @param tilex
     * @param tiley
     * @param zoom
     * @returns {@link Runnable} implementation that performs the desired load
     *          action.
     */
    Runnable createTileLoaderJob(TileSource tileLayerSource, int tilex, int tiley, int zoom);
}
