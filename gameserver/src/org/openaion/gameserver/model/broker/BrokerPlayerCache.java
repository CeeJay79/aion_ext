/*
 * This file is part of aion-unique <aion-unique.org>.
 *
 *  aion-unique is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-unique is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-unique.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.openaion.gameserver.model.broker;

import java.util.ArrayList;
import java.util.List;

import org.openaion.gameserver.model.gameobjects.BrokerItem;

/**
 * @author ATracer, ginho1
 *
 */
public class BrokerPlayerCache
{
	private BrokerItem[]	brokerListCache	= new BrokerItem[0];
	private int				brokerMaskCache;
	private int				brokerSoftTypeCache;
	private int				brokerStartPageCache;
	private List<Integer> searchItemsId = new ArrayList<Integer>();
	/**
	 * @return the brokerListCache
	 */
	public BrokerItem[] getBrokerListCache()
	{
		return brokerListCache;
	}

	/**
	 * @param brokerListCache
	 *            the brokerListCache to set
	 */
	public void setBrokerListCache(BrokerItem[] brokerListCache)
	{
		this.brokerListCache = brokerListCache;
	}

	/**
	 * @return the brokerMaskCache
	 */
	public int getBrokerMaskCache()
	{
		return brokerMaskCache;
	}

	/**
	 * @param brokerMaskCache
	 *            the brokerMaskCache to set
	 */
	public void setBrokerMaskCache(int brokerMaskCache)
	{
		this.brokerMaskCache = brokerMaskCache;
	}

	/**
	 * @return the brokerSoftTypeCache
	 */
	public int getBrokerSortTypeCache()
	{
		return brokerSoftTypeCache;
	}

	/**
	 * @param brokerSoftTypeCache
	 *            the brokerSoftTypeCache to set
	 */
	public void setBrokerSortTypeCache(int brokerSoftTypeCache)
	{
		this.brokerSoftTypeCache = brokerSoftTypeCache;
	}

	/**
	 * @return the brokerStartPageCache
	 */
	public int getBrokerStartPageCache()
	{
		return brokerStartPageCache;
	}

	/**
	 * @param brokerStartPageCache
	 *            the brokerStartPageCache to set
	 */
	public void setBrokerStartPageCache(int brokerStartPageCache)
	{
		this.brokerStartPageCache = brokerStartPageCache;
	}

	public void setSearchItemsId(List<Integer> searchItemsId)
	{
		this.searchItemsId = searchItemsId;
	}

	public List<Integer> getSearchItemsId()
	{
		if(this.searchItemsId.isEmpty())
			return null;
		return this.searchItemsId;
	}
}