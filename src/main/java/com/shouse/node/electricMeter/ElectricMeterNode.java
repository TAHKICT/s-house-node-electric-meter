package com.shouse.node.electricMeter;

import shouse.core.api.Notifier;
import shouse.core.communication.NodeCommunicator;
import shouse.core.communication.Packet;
import shouse.core.node.Node;
import shouse.core.node.NodeInfo;
import shouse.core.node.NodeLocation;
import shouse.core.node.request.Request;
import shouse.core.node.response.Response;

import java.util.List;

public class ElectricMeterNode extends Node {

    public ElectricMeterNode(int id, NodeLocation nodeLocation, NodeCommunicator nodeCommunicator, List<Notifier> notifiers, String description) {
        super(id, nodeLocation, nodeCommunicator, notifiers, description);
    }

    public NodeInfo getNodeInfo() {
        return null;
    }

    public Response processRequest(Request request) {
        return null;
    }

    public void processPacket(Packet packet) {

    }
}
